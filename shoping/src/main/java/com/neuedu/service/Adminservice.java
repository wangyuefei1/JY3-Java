package com.neuedu.service;

import com.neuedu.common.HigherResponse;
import com.neuedu.pojo.Product;
import com.neuedu.vo.ProAndDeVO;
import com.neuedu.vo.ProListVO;

import javax.servlet.http.HttpSession;

public interface Adminservice {


        HigherResponse login(String username, String password, HttpSession session);

        HigherResponse addOrUpdatePro(Product product);

        HigherResponse setSaleStatus(Integer id,Integer status );

        HigherResponse <ProAndDeVO> detailDO(Integer id);

        HigherResponse listDO(Integer pageNum,Integer pageSize);

        HigherResponse queryUser();

        HigherResponse<ProListVO> selectProByName(String name, Integer pageNum, Integer pageSize);

}
