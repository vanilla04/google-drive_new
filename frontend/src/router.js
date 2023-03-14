
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import DriveManager from "./components/listers/DriveCards"
import DriveDetail from "./components/listers/DriveDetail"

import IndexManager from "./components/listers/IndexCards"
import IndexDetail from "./components/listers/IndexDetail"

import StreamManager from "./components/listers/StreamCards"
import StreamDetail from "./components/listers/StreamDetail"


import DashboardView from "./components/DashboardView"
import DashboardViewDetail from "./components/DashboardViewDetail"
import NofityManager from "./components/listers/NofityCards"
import NofityDetail from "./components/listers/NofityDetail"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/drives',
                name: 'DriveManager',
                component: DriveManager
            },
            {
                path: '/drives/:id',
                name: 'DriveDetail',
                component: DriveDetail
            },

            {
                path: '/indices',
                name: 'IndexManager',
                component: IndexManager
            },
            {
                path: '/indices/:id',
                name: 'IndexDetail',
                component: IndexDetail
            },

            {
                path: '/streams',
                name: 'StreamManager',
                component: StreamManager
            },
            {
                path: '/streams/:id',
                name: 'StreamDetail',
                component: StreamDetail
            },


            {
                path: '/dashboards',
                name: 'DashboardView',
                component: DashboardView
            },
            {
                path: '/dashboards/:id',
                name: 'DashboardViewDetail',
                component: DashboardViewDetail
            },
            {
                path: '/nofities',
                name: 'NofityManager',
                component: NofityManager
            },
            {
                path: '/nofities/:id',
                name: 'NofityDetail',
                component: NofityDetail
            },



    ]
})
