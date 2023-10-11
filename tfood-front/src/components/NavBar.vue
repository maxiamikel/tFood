<template>
  <div id="nav">
    <router-link to="/" id="logo_url"><img :src="logo" :alt="alt" id="logo"></router-link>
    <router-link to="/">Home</router-link> 
    <router-link to="/orders">Orders</router-link> 
    <router-link to="/about">About</router-link>
  </div>
</template>

<script>
//import { defineComponent } from "@vue/composition-api";

export default {
 name:"NavBar",
 props:["logo", "alt"]
}
</script>

<style scoped>
    #nav{
        background-color: #5F9EA0;
        border-bottom: solid 3px  #CD853F;
        padding: 15px 45px;
        justify-content: flex-end;
        display: flex;
        align-items: center;
    }

    #nav a{
        color: #333;
        text-decoration: none;
        margin: 11px;
        transition: .5s;
        text-transform: uppercase;
        font-size: 15px;
        font-weight: bold;
    }

    #nav a:hover{
        color:  #FFF;
    }

    #nav #logo_url{
        margin: auto;
        margin-left: 0;
    }

    #logo{
        width: 50px;
        height: 50px;
    }

   

</style>
