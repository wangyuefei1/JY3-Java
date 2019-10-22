<template>
  <div>
    <el-row class="toprow">
      <el-button type="primary" @click="addcate">添加分类</el-button>
    </el-row>
    <el-table ref="multipleTable" :data="goodsData" tooltip-effect="dark" style="width: 100%">
      <el-table-column type="selection" width="55"></el-table-column>
      <el-table-column prop="id" label="编号" width="120"></el-table-column>
      <el-table-column prop="category" label="类别名称" width="120"></el-table-column>
      <el-table-column prop="address" label="操作" show-overflow-tooltip>
        <template>
          <el-button size="mini">编辑</el-button>
          <el-button size="mini">删除</el-button>
        </template>
      </el-table-column>
    </el-table>
    <el-dialog :title="title" :visible.sync="dialogVisible" width="30%" :before-close="handleClose">
      <el-form ref="form" :model="form" label-width="80px">
        <el-form-item label="id">
          <el-input v-model="form.id"></el-input>
        </el-form-item>
        <el-form-item label="类别名称">
          <el-input v-model="form.category"></el-input>
        </el-form-item>
      </el-form>
      <span slot="footer" class="dialog-footer">
        <el-button @click="dialogVisible = false">取 消</el-button>
        <el-button type="primary" @click="save">确 定</el-button>
      </span>
    </el-dialog>
  </div>
</template>
<script>
export default {
  data() {
    return {
      dialogVisible: false,
      form: {
        id: "",
        category: ""
      },
      goodsData: [
        {
          id: "1",
          category: "数码"
        },
        {
          id: "2",
          category: "手机"
        }
      ],
      title: ""
    };
  },
  methods: {
    handleClose() {
      this.dialogVisible = false;
    },
    save() {
      if (this.title == "添加类别") {
        let category = { id: "", category: "" };
        category.id = this.form.id;
        category.category = this.form.category;
        this.goodsData.push(category);
        this.dialogVisible = false;
      } else if (this.title == "编辑用户") {
        this.goodsData.forEach(item => {
          if (item.category == this.form.category) {
            item.category = this.form.category;
            this.dialogVisible = false;
          }
        });
      }
    },
    addcate() {
      this.form.id = "";
      this.form.category = "";
      this.title = "添加类别";
      this.dialogVisible = true;
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
</style>