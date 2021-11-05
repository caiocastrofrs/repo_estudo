import './App.css';
import SayMyName from './components/SayMyName/';
import Pessoa from './components/Pessoa';
import imagem from './homem-feliz-dinheiro.jpg';

function App() {
  return (
    <div className="App">
      <img src={imagem} alt="homem feliz dinheiro"/>
      <SayMyName name="caio" resto="beleza?"/>
      <Pessoa nome="Caio Castro" profissao="Vagabundo" texto="Olá estou aqui a procura de emprego" foto="https://picsum.photos/1400/300"/>
    </div>
  );
}

export default App;
