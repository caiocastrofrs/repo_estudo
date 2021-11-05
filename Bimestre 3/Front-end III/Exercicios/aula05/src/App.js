import './App.css';
import Header from './components/Header';
import Banner from './components/Banner';
import Footer from './components/Footer';
function App() {
  return (
    <>
      <Header></Header>
      <Banner texto="Essa empresa faz de tudo, menos nada!"><button>Clique aqui!</button></Banner>
      <Footer></Footer>
    </>
  );
}

export default App;
