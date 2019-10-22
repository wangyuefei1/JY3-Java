<template>
  <div>
    <el-row class="toprow">
      <el-button type="primary" @click="adduser">添加用户</el-button>
      <el-button type="success" @click="batchDel">批量删除</el-button>
    </el-row>
    <el-table
      ref="multipleTable"
      :data="userData"
      tooltip-effect="dark"
      style="width: 100%"
      @selection-change="handleSelectionChange"
    >
      <el-table-column type="selection" width="55"></el-table-column>
      <el-table-column label="编号" prop="id" width="120"></el-table-column>
      <el-table-column prop="username" label="用户" width="120"></el-table-column>
      <el-table-column prop="createtime" label="创建日期" show-overflow-tooltip></el-table-column>
      <el-table-column prop="address" label="操作" show-overflow-tooltip>
        <template slot-scope="scope">
          <el-button size="mini" @click="handleEdit(scope.$index, scope.row)">编辑</el-button>
          <el-button size="mini" type="danger" @click="handleDelete(scope.$index, scope.row)">删除</el-button>
        </template>
      </el-table-column>
    </el-table>
    <el-dialog :title="title" :visible.sync="dialogVisible" width="30%" :before-close="handleClose">
      <el-form ref="form" :model="form" label-width="80px">
        <el-form-item label="编号">
          <el-input v-model="form.id"></el-input>
        </el-form-item>
        <el-form-item label="用户">
          <el-input v-model="form.username"></el-input>
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
      form: {
        id: "",
        username: "",
        createtime: ""
      },
      userData: [
        { id: 1, username: "张三", createtime: "2019-08-13" },
        { id: 2, username: "李四", createtime: "2019-08-13" },
        { id: 3, username: "王五", createtime: "2019-08-13" }
      ],
      multipleSelection: [],
      title: "",
      dialogVisible: false
    };
  },
  methods: {
    handleSelectionChange(val) {
      this.multipleSelection = val;
    },
    handleEdit(index, row) {
      this.title = "编辑用户";
      this.dialogVisible = true;
      this.form.id = row.id;
      this.form.username = row.username;
      console.log(index + "->" + row.username);
    },
    handleDelete(index, row) {
      this.userData.splice(index, 1);
      console.log(index + "->" + row.username);
    },
    batchDel() {
      this.multipleSelection.forEach(element => {
        this.userData.forEach((item, index) => {
          if (item.username == element.username) {
            this.userData.splice(index, 1);
          }
        });
      });
    },
    handleClose() {},
    save() {
      if (this.title == "添加用户") {  
        let user = {id:"",username:"",createtime:""};
        user.id = this.form.id;
        user.username = this.form.username;
        user.createtime = "2019-08-14";
        this.userData.push(user);
        this.dialogVisible = false;
      } else if (this.title == "编辑用户") {
        this.userData.forEach(item => {
          if (item.username == this.form.username) {
            item.username = this.form.username;
            this.dialogVisible = false;
          }
        });
      }
    },
    adduser() {
      this.form.id = "";
      this.form.username = "";
      this.title = "添加用户";
      this.dialogVisible = true;
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