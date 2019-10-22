import Vue from 'vue'
import Router from 'vue-router'
import Home from './views/Home.vue'
import Admin from './views/admin/index.vue'


Vue.use(Router)

export default new Router({
  mode: 'history',
  base: process.env.BASE_URL,
  routes: [
    {
      path: '/home',
      name: 'home',
      component: Home
    },
    {
      path: '/admin',
      name: 'layout',
      component: Home,
      children:[
        {path:'admin', name:'amdin', component:Admin,},
        {path:'resetpwd',name:'resetpwd',component: ()=>import('@/views/admin/resetpwd.vue'),},
        {path:'goods',name:'goods',component: ()=>import('@/views/goods/index.vue'),},
        {path:'order',name:'order',component: ()=>import('@/views/goods/order.vue'),},
        {path:'category',name:'category',component: ()=>import('@/views/goods/category.vue'),},
      ]
    },
    // {
    //   path: '/admin/resetpwd',
    //   name: 'resetpwd',
    //   component: () => import('./views/admin/resetpwd.vue')
    // },
    {
      path: '/',
      name: "login",
      component: () => import('@/views/Login.vue')
    }
  ]
})
