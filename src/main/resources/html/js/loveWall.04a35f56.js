(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["loveWall"],{a298:function(t,e,o){"use strict";o.r(e);var n=function(){var t=this,e=t.$createElement,o=t._self._c||e;return o("div",[o("van-pull-refresh",{on:{refresh:t.onRefresh},model:{value:t.isLoading,callback:function(e){t.isLoading=e},expression:"isLoading"}},[o("van-nav-bar",{attrs:{title:"表白墙","left-text":"返回","left-arrow":"",fixed:""},on:{"click-left":t.onClickLeft}}),o("p",[t._v("刷新次数: "+t._s(t.count))]),o("div",{staticStyle:{"margin-top":"46px"},attrs:{id:"love-content"}},[o("van-dropdown-menu",[o("van-dropdown-item",{attrs:{options:t.option1},model:{value:t.value1,callback:function(e){t.value1=e},expression:"value1"}}),o("van-dropdown-item",{attrs:{options:t.option2},model:{value:t.value2,callback:function(e){t.value2=e},expression:"value2"}})],1),o("van-list",{attrs:{finished:t.finished,"finished-text":"没有更多了"},on:{load:t.onLoad},model:{value:t.loading,callback:function(e){t.loading=e},expression:"loading"}},t._l(t.list,(function(e){return o("div",{key:e,attrs:{title:e}},[o("van-panel",{attrs:{icon:"https://img.yzcdn.cn/vant/cat.jpeg",title:"标题",desc:"描述信息",status:"状态"}},[o("router-link",{attrs:{to:"/love"}},[o("div",[o("div",[t._v(" Vue (读音 /vjuː/，类似于 view) 是一套用于构建用户界面的渐进式框架。与其它大型框架不同的是， Vue 被设计为可以自底向上逐层应用。Vue 的核心库只关注视图层，不仅易于上手，还便于与第三方库或既有项目整合。另一方面，当与 现代化的工具链以及各种支持类库结合使用时，Vue 也完全能够为复杂的单页应用提供驱动。 "+t._s(e)+" ")])])]),o("div",{attrs:{slot:"footer"},slot:"footer"},[t._v(" 222 ")]),o("div",{attrs:{slot:"footer"},slot:"footer"},[t._v(" 111111 ")])],1),o("van-divider",{style:{color:"#1989fa",borderColor:"#1989fa",padding:"0 16px"},attrs:{hairline:""}},[t._v("分割线")])],1)})),0)],1)],1)],1)},i=[],a={data:function(){return{value:0,count:0,isLoading:!1,value1:0,value2:"a",option1:[{text:"全部商品",value:0},{text:"新款商品",value:1},{text:"活动商品",value:2}],option2:[{text:"默认排序",value:"a"},{text:"好评排序",value:"b"},{text:"销量排序",value:"c"}],list:[],loading:!1,finished:!1}},methods:{onClickLeft:function(){this.$router.go(-1)},onRefresh:function(){var t=this;setTimeout((function(){t.$toast("刷新成功"),t.isLoading=!1,t.count++}),500)},onLoad:function(){var t=this;setTimeout((function(){for(var e=0;e<10;e++)t.list.push(t.list.length+1);t.loading=!1,t.list.length>=40&&(t.finished=!0)}),500)}}},l=a,s=o("2877"),r=Object(s["a"])(l,n,i,!1,null,null,null);e["default"]=r.exports}}]);
//# sourceMappingURL=loveWall.04a35f56.js.map