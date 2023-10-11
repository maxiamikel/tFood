<template>
  <div class="home">
    <HelloWorld />
    
    <table class="table table-borded">
      <thead>
        <th scope="col">ID</th>
        <th scope="col">CPF</th>
        <th scope="col">NAME</th>
        <th scope="col">EMAIL</th>
        <th scope="col">FONE NUMBER</th>
        <th scope="col">BURTHDAY</th>
        <th scope="col">ACTION</th>
      </thead>
      <tbody>
        <tr v-for="obj in users" :key="obj.id">
          <th scope="row">{{obj.id}}</th>
          <td>{{obj.id}}+1</td>
          <td>{{obj.cpf}}</td>
          <td>{{obj.nome}}</td>
          <td>{{obj.email}}</td>
          <td>{{obj.telefone}}</td>
          <td>{{obj.burthday}}</td>
          <td></td>
        </tr>
        
      </tbody>
    </table>
  </div>
</template>

<script>
// @ is an alias to /src
import HelloWorld from '@/components/HelloWorld.vue'
import { compile } from 'vue'

export default {
  name: 'HomeView',
  components: {
    HelloWorld
  },
  data(){
    return{
      users:[]
    }
  },
  methods:{
    async getUser(){
      const req = await fetch('http://localhost:8080/api/users/')
      const data = await req.json()

      this.users = data
      console.log(data)
    }
  },
  mounted(){
    this.getUser();
  }
}
</script>
