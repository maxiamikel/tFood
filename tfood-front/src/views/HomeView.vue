<template>
  <div class="main-container">
    <Barnner />
    <h1>Clientes</h1>
    <table>
      <thead>
        <tr>
          <th scope="col">ID</th>
          <th scope="col">CPF</th>
          <th scope="col">NOME</th>
          <th scope="col">EMAIL</th>
        </tr>
      </thead>
      <tbody>
        <tr v-for="obj in users" :key="obj.id">
          <th scope="row">{{obj.id}}</th>
          <td>{{obj.id}}</td>
          <td>098.321.334-09</td>
          <td>Amikel Maxi</td>
          <td>maxlover@gmail.com</td>
          <td>Editar</td>
        </tr>
      </tbody>
    </table>
    <OrderForm />
  </div>
</template>


<script>
import Barnner from "../components/Barnner.vue"
import OrderForm from "../components/OrderForm.vue"
export default{
  
  name: "HomeView",
  components:{
    Barnner, OrderForm
  },
  data(){
    return{
      users:[]
    }
  },
  methods:{
    async getUsers(){
      const req = await fetch('http://localhost:8080/api/users/');
      const data = await req.json();

      console.log(data)
    }
  }, mounted(){
    this.getUsers();
  }
}


</script>
