import { createWebHistory, createRouter } from 'vue-router'
import HomePage from './components/HomeComponent.vue';
import OwnerSignIn from './components/owner-signin.vue';
import ownerRegister from './components/owner/register.vue'

const routes = [
    {
        path: '/',
        name: 'Home',
        component: HomePage
    },
    {
        path: '/ownersignin',
        name: 'OwnerSignin',
        component: OwnerSignIn
    },
    {
        path: '/ownersignup',
        name: 'OwnerSignUp',
        component: ownerRegister
    }
];

const router = createRouter({
    history: createWebHistory(),
    routes
})
export default router;
