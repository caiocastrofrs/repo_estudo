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
        listaConvidados.map(({name, presente, tarefa}) => {
          return(
            <>
              <ClassComponent nome={name} estaNaLista={presente} />
              <FunctionComponent nome={name} tarefa={tarefa}></FunctionComponent>
            </>
          )
        })
      }
    </div>
  );
}

export default App;
