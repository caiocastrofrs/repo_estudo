import { Formik, Form, Field } from 'formik';
import { useState } from 'react';
import api from '../../services/api';
import { useParams } from 'react-router-dom';
import { useEffect } from 'react';
const ApiCEP = () => {
  
  const { cepUrl } = useParams();

  const [resultado, setResultado] = useState({});
  
/*   const handleSubmit = async ({ cep }) => {
    if (cep) {
      const { data } = await api.get(`apicep/${cepUrl}/json/`);
      setResultado(data);
    }
  } */

  useEffect(() => {
    async function loadCep() {
      try {
        const response = await api.get(`${cepUrl}/json/`);
        setResultado(response.data);
      } catch (error) {
        console.log("deu ruim");
      }
    }
    loadCep();
  }, [cepUrl]);

    return(
        <Formik initialValues={{ cep: '' }} /* onSubmit={handleSubmit} */>
            <Form>
                <Field placeholder="Insira o CEP" required type="text" name="cep" id="cep" className="form-control" />
                <Field placeholder="Logradouro" required type="text" value={resultado.logradouro} name="logradouro" id="logradouro" className="form-control" disabled/>
                <Field placeholder="Complemento" required type="text" value={resultado.complemento} name="complemento" id="complemento" className="form-control" disabled/>
                <Field placeholder="Bairro" required type="text" value={resultado.bairro} name="bairro" id="bairro" className="form-control" disabled/>
                <Field placeholder="Localidade" required type="text" value={resultado.localidade} name="localidade" id="localidade" className="form-control" disabled/>
                <Field placeholder="UF" required type="text" value={resultado.uf} name="uf" id="uf" className="form-control" disabled/>
                <button className="btn btn-primary my-4" type="submit">Pesquisar</button>
            </Form>
        </Formik>
    );
}

export default ApiCEP;