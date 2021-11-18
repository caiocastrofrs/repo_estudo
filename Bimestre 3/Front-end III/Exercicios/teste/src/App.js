import './App.css';
import Projeto from './Components/Projeto/'
import Projetos from './Components/Projetos/'
function App() {

  var count = 3;

  const projetos = [
    {
      id : 1,
      nome: 'projeto 1',
      src : 'https://picsum.photos/50',
    },
    {
      id : 4,
      nome: 'projeto 2',
      src : 'https://picsum.photos/100',
    },
    {
      id : 3,
      nome: 'projeto 3',
      src : 'https://picsum.photos/150',
    },
  ];
  const contador = () => {
    if(count === 3) {
      count = 0;
    }
    count+=1;
  }
  return (
    <div className="App">
      <Projetos>
        {count === 1 ? <Projeto nome={projetos[0].nome} src={projetos[0].src}/> : false}
        {count === 2 ? <Projeto nome={projetos[1].nome} src={projetos[1].src}/> : false}
        {count === 3 ? <Projeto nome={projetos[2].nome} src={projetos[2].src}/> : false}
      </Projetos>
      <button onClick={contador}>Click me</button>
    </div>
  );
}

export default App;
