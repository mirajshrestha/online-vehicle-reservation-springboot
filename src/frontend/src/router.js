import { createWebHistory, createRouter } from 'vue-router'
import HomePage from './components/HomeComponent.vue';
import OwnerSignIn from './components/owner-signin.vue';

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
    }
];

const router = createRouter({
    history: createWebHistory(),
    routes
})
export default router;
