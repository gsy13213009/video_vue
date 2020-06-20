import Vue from 'vue'
import Router from 'vue-router'
import Login from './views/login.vue'
import admin from './views/admin.vue'

Vue.use(Router);

export default new Router({
  mode: 'history',
  bash: process.env.BASE_URL,
  routes: [
    {
      path: '*',
      redirect: "/login",
    },
    {
      path: '/login',
      component: Login
    },
    {
      path: '/admin',
      component: admin,
      children: [
        {
          path: 'welcome',
          component: () => import('@/views/admin/welcome')
        }
      ]
    }
  ]
})
