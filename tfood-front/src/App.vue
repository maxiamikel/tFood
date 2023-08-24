<template>
  <NavBar :logo="logo_img" :alt="app_name"/>
  <router-view/>
  <Footer />
</template>
<script>
import NavBar from "./components/NavBar.vue"
import Footer from "./components/Footer.vue"
export default {
  components: {
    NavBar, Footer
  },
  data (){
    return{
      logo_img: "/img/logo.png",
      app_name: "Fast Food System"
    }
  }
}
</script>

<style>
  *{
    padding: 0;
    margin: 0;
    box-sizing: border-box;
    font-family: 'Gill Sans', 'Gill Sans MT', Calibri, 'Trebuchet MS', sans-serif;
  }

  .main-container{
    margin: 2px 60px;
    min-height: 470px;
  }

  h1{
    font-size: 38px;
    color: #333333;
    text-align: center;
    margin-bottom: 20px;;
  }
</style>
