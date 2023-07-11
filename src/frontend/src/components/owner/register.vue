<template>
  <navbar />
  <section></section>
  <form @submit.prevent="save">
    <label for="">Full Name: </label><br />
    <input type="text" v-model="owner.fullname" /><br />
    <label for="">Email:</label><br />
    <input type="email" name="" id="" v-model="owner.email" /><br />
    <label for="">Password:</label><br />
    <input type="password" name="" id="" v-model="owner.password" /><br />
    <label for="">Mobile Number</label><br />
    <input type="text" name="" id="" v-model="owner.contact" /><br />
    <br />
    <input type="submit" value="Register" />
  </form>
</template>
<script>
import Navbar from "../Navbar.vue";

export default {
  components: { Navbar },
  name: "ownerRegister",
  data() {
    return {
      owner: {
        owners_id: "",
        fullname: "",
        email: "",
        password: "",
        contact: "",
      },
    };
  },
  methods: {
    save() {
      fetch("/api/owner/register", {
        method: "POST",
        headers: { "Content-Type": "application/json" },
        body: JSON.stringify({
          fullname: this.owner.fullname,
          email: this.owner.email,
          password: this.owner.password,
          contact: this.owner.contact,
        }),
        
      })
      .then(() => {
        alert("Registerd successfully"),
        window.location.href = "/ownersignin"
      })
      
    },
  },
};
</script>