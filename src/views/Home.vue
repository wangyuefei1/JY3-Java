<template>
  <div class="home">
    <el-container >
      <el-header class="el-header"><h2>后台管理系统</h2></el-header>
    </el-container>
    <el-container>
       <el-aside class="el-aside">
          <Aside/>
       </el-aside>
       <el-main>
         <template>
           <router-view/>
         </template>
       </el-main>
    </el-container>
  </div>
</template>

<script>
import Aside from '@/components/aside/index.vue'

export default {
  name: 'home',
  components: { 
    Aside
  }
}
</script>
<style scoped>
.el-header, .el-footer {
    background-color: #B3C0D1;
    color: #333;
    text-align: center;
    /* line-height: 80px; */
  }
  /* .el-main {
    background-color: #E9EEF3;
    color: #333;
    text-align: center;
    line-height: 160px;
  } */
</style>