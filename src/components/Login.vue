<template>
  <div id="box_login">
    <h1>登录</h1>
    <form @submit.prevent="handleLogin">
      <table>
        <tr>
          <td>邮箱:</td>
          <td><input type="email" v-model="userEmail" required></td>
        </tr>
        <tr>
          <td>密码:</td>
          <td><input type="password" v-model="userPassword" required></td>
        </tr>
        <tr>
          <td colspan="2">
            <button type="submit">登录</button>
            <button type="reset">重置</button>
          </td>
        </tr>
      </table>
    </form>
    <p v-if="errorMessage">{{ errorMessage }}</p>
  </div>
</template>

<script>
import axios from 'axios';

export default {
  data() {
    return {
      userEmail: '',
      userPassword: '',
      errorMessage: ''
    };
  },
  methods: {
    async handleLogin() {
      try {
        const response = await axios.post('http://localhost:8080/login', {
          userEmail: this.userEmail,
          userPassword: this.userPassword
        });
        if (response.data) {
          // 登录成功
          alert('登录成功');
        } else {
          // 登录失败
          this.errorMessage = '用户名或密码错误';
        }
      } catch (error) {
        console.error(error);
        this.errorMessage = '登录失败，请稍后重试';
      }
    }
  }
};
</script>

<style scoped>
#box_login {
  position: fixed;
  top: 25%;
  left: 35%;
  width: 400px;
  height: 300px;
  padding: 30px 50px 40px 50px;
  background-color: white;
  border-radius: 20px;
  margin: 0 auto;
  border: 1px solid #ccc;
  display: flex;
  flex-direction: column;
}

table {
  width: 100%;
}

td {
  padding: 10px;
}
</style>