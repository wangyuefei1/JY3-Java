<template>
  <div>
    <el-row class="toprow">
      <el-button type="primary" @click="addgoods">添加商品</el-button>
      <el-button type="success">上架</el-button>
      <el-button type="danger">批量删除</el-button>
    </el-row>
    <el-table ref="multipleTable" :data="goodsData" tooltip-effect="dark" style="width: 100%">
      <el-table-column type="selection" width="55"></el-table-column>
      <el-table-column label="编号" prop="id" width="120"></el-table-column>
      <el-table-column prop="goodsname" label="商品名称" width="120"></el-table-column>
      <el-table-column prop="category" label="商品类别" width="120"></el-table-column>
      <el-table-column prop="stock" label="库存" width="120"></el-table-column>
      <el-table-column prop="price" label="价格" width="120"></el-table-column>
      <el-table-column prop="status" label="状态" width="120">
        <template slot-scope="scope">
          <el-tag
            :type="scope.row.status === '正常' ? 'primary' : 'success'"
            disable-transitions
          >{{scope.row.status}}</el-tag>
        </template>
      </el-table-column>
      <el-table-column prop="address" label="操作" show-overflow-tooltip>
        <template>
          <el-button size="mini">编辑</el-button>
        </template>
      </el-table-column>
    </el-table>
    <el-pagination
      @size-change="handleSizeChange"
      @current-change="handleCurrentChange"
      :current-page="currentpage"
      :page-sizes="[10, 20, 30, 40]"
      :page-size="pageSize"
      layout="total, sizes, prev, pager, next, jumper"
      :total="total"
    ></el-pagination>
    <el-dialog :title="title" :visible.sync="dialogVisible" width="30%" :before-close="handleClose">
      <el-form ref="form" :model="form" label-width="80px">
        <el-form-item label="商品名称">
          <el-input v-model="form.goodsname"></el-input>
        </el-form-item>
        <el-form-item label="商品类别">
          <el-cascader :options="options" change-on-select></el-cascader>
        </el-form-item>
        <el-form-item label="商品库存">
          <el-input v-model="form.stock"></el-input>
        </el-form-item>
        <el-form-item label="商品价格">
          <el-input v-model="form.price"></el-input>
        </el-form-item>
        <el-form-item label="商品图片">
          <el-upload
            action="https://jsonplaceholder.typicode.com/posts/"
            list-type="picture-card"
            :on-preview="handlePictureCardPreview"
            :on-remove="handleRemove"
            :auto-upload="isupload"
          >
            <i class="el-icon-plus"></i>
          </el-upload>
        </el-form-item>
      </el-form>
      <span slot="footer" class="dialog-footer">
        <el-button @click="dialogVisible = false">取 消</el-button>
        <el-button type="primary">确 定</el-button>
      </span>
    </el-dialog>
  </div>
</template>
<script>
export default {
  data() {
    return {
      total:25,
      pageSize:10,
      currentpage:1,
      dialogVisible: false,
      isupload: false,
      form: {
        id: "",
        goodsname: ""
      },
      goodsData: [
        {
          id: "1",
          goodsname: "华为",
          category: "数码/手机",
          stock: 100,
          price: 1000,
          status: "正常"
        },
        {
          id: "2",
          goodsname: "小米",
          category: "数码/手机",
          stock: 200,
          price: 2000,
          status: "下架"
        }
      ],
      options: [
        {
          label: "数码",
          value: "1",
          children: [
            {
              label: "手机",
              value: "2"
            }
          ]
        }
      ],
      title: ""
    };
  },
  methods: {
    handleClose() {
      this.dialogVisible = false;
    },
    addgoods() {
      this.dialogVisible = true;
    },
    handleRemove(file, fileList) {
      console.log(file, fileList);
    },
    handlePictureCardPreview() {
      // this.dialogImageUrl = file.url;
      // this.dialogVisible = true;
    },
    handleSizeChange(val) {
      console.log(`每页 ${val} 条`);
    },
    handleCurrentChange(val) {
      console.log(`当前页: ${val}`);
    }
  }
};
</script>
<style scoped>
.toprow {
  margin-bottom: 10px;
  float: left;
}
</style>