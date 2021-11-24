import { useEffect } from 'react';
import { useState } from 'react';
import { useNavigate } from 'react-router-dom';

const NotFound = () => {
  const navigate = useNavigate();

  let [contador , setContador] = useState(5);
  useEffect(() => {
    setTimeout(() => {
      setContador(contador-1);
    },1000);
    setTimeout(() => {
      navigate('/');
    }, 5000);
  }, [navigate, contador]);

  return (
    <>
      <h1>404 nada por aqui</h1>
      <h2>Redirecionando em {contador} segundos</h2>
    </>
  )
}
export default NotFound;