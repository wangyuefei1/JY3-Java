package com.neuedu.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.neuedu.common.Const;
import com.neuedu.common.HigherResponse;
import com.neuedu.dao.CategoryMapper;
import com.neuedu.dao.ProductMapper;
import com.neuedu.dao.UserMapper;
import com.neuedu.pojo.Category;
import com.neuedu.pojo.Product;
import com.neuedu.pojo.User;
import com.neuedu.vo.ProAndDeVO;
import com.neuedu.vo.ProListVO;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Service
public class Adminserviceimpl implements Adminservice {

    @Autowired
    private  UserMapper userMapper;

    @Autowired
    private ProductMapper productMapper;

    @Autowired
    private CategoryMapper categoryMapper;

    @Override
    public HigherResponse login(String username, String password, HttpSession session) {
        if (username == null || username.length() == 0 ){
            return HigherResponse.getResponseFailed("用户名不能为空");
        }
        if (password == null || password.length() == 0 ){
            return HigherResponse.getResponseFailed("密码不能为空");
        }
        int i = userMapper.selectUserByusername(username);
        if (i==0){
            return HigherResponse.getResponseFailed("用户名不存在");
        }
        User user = userMapper.selectUser(username, password);
        if(user != null ){
            if (user.getRole().intValue() == Const.COMMONADMIN){
                session.setAttribute(Const.CURRENTADMIN,user);
                return HigherResponse.getResponseSuccess(user,"登陆成功");
            }
        }
        return HigherResponse.getResponseFailed("用户名或密码错误,重新输入");
    }


    @Override
    public HigherResponse addOrUpdatePro (Product product) {
        if (null != product){
             String[] split  = product.getSubImages().split(",");
             if (split.length > 0){
                String main = split[0];
                product.setMainImage(main);
             }
             if (null != product.getId()){
                 int i = productMapper.updateByPrimaryKeySelective(product);
                 if (i>0){
                     return HigherResponse.getResponseSuccess("修改成功");
                 }else {
                     return HigherResponse.getResponseFailed("修改失败");
                 }
             }
             else {
                 int i = productMapper.insertSelective(product);
                 if (i>0){
                     return HigherResponse.getResponseSuccess("添加成功");
                 }else {
                     return HigherResponse.getResponseFailed("添加失败");
                 }
             }
        }
        return HigherResponse.getResponseFailed("输入错误");
    }

    @Override
    public HigherResponse setSaleStatus(Integer id, Integer status ) {
        if (null == id){
            return HigherResponse.getResponseFailed("请输入要修改的商品id");
        }
        if (null == status){
            return HigherResponse.getResponseFailed("请选择商品状态");
        }
        Product product = new Product();
        product.setId(id);
        product.setStatus(status);
        int i = productMapper.updateByPrimaryKeySelective(product);
        if (i>0){
            return HigherResponse.getResponseSuccess("修改成功");
        }
        return HigherResponse.getResponseFailed("修改失败");
    }

    @Override
    public HigherResponse<ProAndDeVO> detailDO(Integer id) {
        if (null == id){
            return HigherResponse.getResponseFailed("请输入要查看的商品id");
        }
        Product product = productMapper.selectProById(id);
        ProAndDeVO detailVO = getDetailVO(product);
        return HigherResponse.getResponseSuccess(detailVO,"查看成功");
    }

    @Override
    public HigherResponse listDO(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<Product> allPro = productMapper.getAllPro();
        List<ProListVO> objects = new ArrayList<>();
        for (Product p :allPro) {
            ProListVO listVO = getListVO(p);
            objects.add(listVO);
        }
        PageInfo<ProListVO> pageInfo = new PageInfo<>();
        pageInfo.setList(objects);
        return HigherResponse.getResponseSuccess(pageInfo,"查询成功");
    }

    @Override
    public HigherResponse queryUser() {
        List<User> users = userMapper.queryUser();
        return HigherResponse.getResponseSuccess(users,"查询成功");
    }

    @Override
    public HigherResponse selectProByName(String name, Integer pageNum, Integer pageSize) {
//        if (StringUtils.isNotBlank(name)){
//            name = new StringBuilder().append("%").append("name").append("%").toString();
//        }
        PageHelper.startPage(pageNum,pageSize);
        List<Product> allPro = productMapper.selectProByName(name);
        List<ProListVO> objects = new ArrayList<>();
        for (Product p :allPro) {
             ProListVO listVO = getListVO(p);
             objects.add(listVO);
        }
        PageInfo<ProListVO> pageInfo = new PageInfo<>();
        pageInfo.setList(objects);
        return HigherResponse.getResponseSuccess(pageInfo,"查询成功");
    }

    //创建ProListVO
    public ProListVO  getListVO(Product product){
        ProListVO proListVO = new ProListVO();
        proListVO.setId(product.getId());
        proListVO.setCategoryId(product.getCategoryId());
        proListVO.setName(product.getName());
        proListVO.setSubTitle(product.getSubtitle());
        proListVO.setMainImage(product.getMainImage());
        proListVO.setStatus(product.getStatus().byteValue());
        proListVO.setPrice(product.getPrice());
        return proListVO;
    }
    //创建VO
    public ProAndDeVO getDetailVO(Product product){
        ProAndDeVO proAndDeVO = new ProAndDeVO();
        proAndDeVO.setId(product.getId());
        proAndDeVO.setCategoryId(product.getCategoryId());
        Category category = categoryMapper.selectByPrimaryKey(product.getCategoryId());
        if (null == category.getParentId()){
            proAndDeVO.setCategoryId(0);
        }else {
            proAndDeVO.setCategoryId(category.getParentId());
        }
        proAndDeVO.setName(product.getName());
        proAndDeVO.setSubTitle(product.getSubtitle());
        proAndDeVO.setImageHost(Const.IMAGEHOST);
        proAndDeVO.setMainImage(product.getMainImage());
        proAndDeVO.setSubImage(product.getSubImages());
        proAndDeVO.setDetail(product.getDetail());
        proAndDeVO.setPrice(product.getPrice());
        proAndDeVO.setStock(product.getStock());
        proAndDeVO.setStatus(product.getStatus().byteValue());
        proAndDeVO.setCreateTime(product.getCreateTime().toString());
        proAndDeVO.setUpdateTime(product.getUpdateTime().toString());
        return proAndDeVO;
    }
}
