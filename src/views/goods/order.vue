<template>
  <div>
    <el-row class="toprow">
      <el-dropdown>
        <el-button type="primary">
          已发货
          <i class="el-icon-arrow-down el-icon--right"></i>
        </el-button>
        <el-dropdown-menu slot="dropdown">
          <el-dropdown-item>未发货</el-dropdown-item>
          <el-dropdown-item>已发货</el-dropdown-item>
          <el-dropdown-item>已付款</el-dropdown-item>
          <el-dropdown-item>已完成</el-dropdown-item>
        </el-dropdown-menu>
      </el-dropdown>
      <el-input v-model="input" placeholder="请输入内容" class="inp"></el-input>
      <el-button type="danger">查询</el-button>
    </el-row>
    <el-table ref="multipleTable" :data="goodsData" tooltip-effect="dark" style="width: 100%">
      <el-table-column type="selection" width="55"></el-table-column>
      <el-table-column label="编号" prop="id" width="120"></el-table-column>
      <el-table-column prop="username" label="会员" width="120"></el-table-column>
      <el-table-column prop="goodsname" label="商品名称" width="120"></el-table-column>
      <el-table-column prop="category" label="分类" width="120"></el-table-column>
      <el-table-column prop="status" label="订单状态" width="120">
        <template slot-scope="scope">
          <el-tag
            :type="scope.row.status === '订单完成' ? 'primary' : 'success'"
            disable-transitions
          >{{scope.row.status}}</el-tag>
        </template>
      </el-table-column>
      <el-table-column prop="address" label="操作" show-overflow-tooltip>
        <template>
          <el-button size="mini">发货</el-button>
        </template>
      </el-table-column>
    </el-table>
  </div>
</template>
<script>
export default {
  data() {
    return {
      input:"",
      form: {
        id: "",
        username: "",
        goodsname: "",
        category: "",
        status: ""
      },
      goodsData: [
        {
          id: "001",
          username: "张三",
          goodsname: "华为",
          category: "数码/手机",
          status: "已发货"
        },
        {
          id: "002",
          username: "李四",
          goodsname: "小米",
          category: "数码/手机",
          status: "订单完成"
        }
      ]
    };
  },
  methods: {
    handleClose() {
      this.dialogVisible = false;
    },
    handleRemove(file, fileList) {
      console.log(file, fileList);
    },
    handlePictureCardPreview() {
      // this.dialogImageUrl = file.url;
      // this.dialogVisible = true;
    }
  }
};
</script>
<style scoped>
.toprow {
  margin-bottom: 10px;
  float: left;
}
.inp{
  display: block;
  float: left;
}
</style>