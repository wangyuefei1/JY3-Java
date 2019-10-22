<template>
<!-- 菜单组建 -->
<div class="aside">
    <el-menu
      default-active="2"
      class="el-menu-vertical-demo"
      @open="handleOpen"
      @close="handleClose">
      <el-submenu index="1"> 
        <template slot="title">
          <i class="el-icon-location"></i>
          <span>用户管理</span>
        </template>
        <el-menu-item-group>
            <el-menu-item index="11" @click="navUser">用户管理</el-menu-item>
            <!-- <router-link to="/admin/admin">用户管理</router-link> -->
        </el-menu-item-group>
        <el-menu-item-group>
           <el-menu-item index="12"  @click="navUser1" >密码重置</el-menu-item>
        </el-menu-item-group>
      </el-submenu>
      <el-submenu index="2">
       <template slot="title">
          <i class="el-icon-menu"></i>
          <span>商品管理</span>
        </template>
        <el-menu-item-group>
           <el-menu-item index="21" @click="navGood">商品管理</el-menu-item>
        </el-menu-item-group>
        <el-menu-item-group>
           <el-menu-item index="22" @click="navCate">商品分类</el-menu-item>
        </el-menu-item-group>
      </el-submenu>
      <el-submenu index="3">
       <template slot="title">
          <i class="el-icon-document"></i>
          <span>订单管理</span>
        </template>
        <el-menu-item-group>
           <el-menu-item index="31"  @click="navOrder">订单管理</el-menu-item>
        </el-menu-item-group>
      </el-submenu>
      <el-submenu index="4">
       <template slot="title">
          <i class="el-icon-setting"></i>
          <span>会员管理</span>
        </template>
        <el-menu-item-group>
           <el-menu-item index="41">会员管理</el-menu-item>
        </el-menu-item-group>
      </el-submenu>
    </el-menu>
</div>
</template>

<style scoped>

</style>

<script>
export default {
    data(){
        return{};
    },
    methods:{
        handleOpen(key,keyPath){
            console.log(key,keyPath);
        },
        handleClose(key,keyPath){
            console.log(key,keyPath);
        },
        navUser(){
          if(this.$route.path != '/admin/admin'){
          this.$router.push('/admin/admin');
          }
        },
        navUser1(){
          if(this.$route.path != '/admin/resetpwd'){
          this.$router.push('/admin/resetpwd');
          }
        },
        navGood(){
          if(this.$route.path != '/admin/goods'){
          this.$router.push('/admin/goods');
          }
        },
        navOrder(){
          if(this.$route.path != '/admin/order'){
          this.$router.push('/admin/order');
          }
        },
        navCate(){
           if(this.$route.path != '/admin/category'){
          this.$router.push('/admin/category');
          }
        }

    }
}
</script>