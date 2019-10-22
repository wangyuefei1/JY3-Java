<template>
    <div class="container">
    <el-form ref="form" :model="form" label-width="88px" class="form" :rules="rules">
      <el-form-item label="用户" prop="username">
        {{username}}
      </el-form-item>
      <el-form-item label="密码" prop="password">
        <el-input
          prefix-icon="el-icon-key"
          type="password"
          v-model="form.password"
          placeholder="请输入密码"
        ></el-input>
      </el-form-item>
      <el-button  type="primary">确定</el-button>
    </el-form>
  </div>
</template>
<script>
export default {
    data(){
        return{
            form:{
                password:""
            },
            username:'admin'
        };
    }
}
</script>
<style scoped>

.form {
  width: 400px;
  /* margin: auto; */
  border-radius: 5px;
  /* background-color: whitesmoke; */
  padding:  30px 20px 20px;
}
</style>