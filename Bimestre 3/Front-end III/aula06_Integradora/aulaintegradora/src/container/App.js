import '../styles/App.css';
import ClassComponent from '../components/ClassComponent';
import FunctionComponent from '../components/FunctionComponent';

function App() {
  const listaConvidados = [
    {
      name:'Nicolas',
      presente:true,
      tarefa:'batata-frita'
    },
    {
      name:'Pedro',
      presente:false,
      tarefa:'pizza'
      
    },
    {
      name:'Carolina',
      presente:true,
      tarefa:'bebidas'
    }
  ]
  return (
    <div className="App">
      <h3>Convidado:</h3>
      {
        listaConvidados.map((convidado) => {
          return(<>
            <ClassComponent nome={convidado.name} estaNaLista={convidado.presente} />
            <FunctionComponent nome={convidado.name} tarefa={convidado.tarefa}></FunctionComponent>
            </>
          )
        })
      }
    </div>
  );
}

export default App;
