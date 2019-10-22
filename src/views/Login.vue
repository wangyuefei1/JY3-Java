<template>
  <div class="container">
    <el-form ref="form" :model="form" label-width="88px" class="form" :rules="rules">
      <el-form-item label="用户" prop="username">
        <el-input prefix-icon="el-icon-user-solid" v-model="form.username" placeholder="请输入用户名"></el-input>
      </el-form-item>
      <el-form-item label="密码" prop="password">
        <el-input
          prefix-icon="el-icon-key"
          type="password"
          v-model="form.password"
          placeholder="请输入密码"
        ></el-input>
      </el-form-item>
      <el-button @click="login" type="primary">登 录</el-button>
    </el-form>
  </div>
</template>
<style scoped>
.container {
  margin-top: 150px;
}
.form {
  width: 400px;
  margin: auto;
  border-radius: 5px;
  background-color: whitesmoke;
  padding: 40px 30px 20px 20px;
}
</style>
<script>
export default {
  data() {
    return {
      form: {
        username: "",
        password: ""
      },
      rules: {
        username: [{ required: true, message: "请输入用户名", trigger: "blur" }]
      }
    };
  },
  methods: {
    login() {
      this.$refs.form.validate(valid => {
        if (valid) {
          if (this.form.username == "admin" && this.form.password == "123") {
            this.$router.push("/home");
          } else {
            alert("登录失败");
          }
        }
      });
    }
  }
};
</script>