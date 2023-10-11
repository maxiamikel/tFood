<template>
<div id="main-barnner">
    <h1>Build yourself your burguer</h1>
</div>
    
</template>

<script>
export default{
    
    
    name: "Barnner"
}
</script>

<style scoped>

#main-barnner{
    background-color: aliceblue;
    background-image: url('/public/img/hamberguer-barnner.jpeg');
    background-position: 0 -250px;
    background-size: cover;
    display: flex;
    height: 450px;
    align-items: center;
    justify-content: flex-start;
}

#main-barnner h1{
    color:#000;
    background-color: #f1f1f1;
    padding: 10px 20px;
    text-align: center;
}
</style>
