import axios from 'axios';

const brasilapi = axios.create({
  baseURL: 'https://brasilapi.com.br'
})

export default brasilapi;