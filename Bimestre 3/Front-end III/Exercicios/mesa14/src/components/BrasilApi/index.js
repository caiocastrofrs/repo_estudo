import { Formik, Form, Field } from 'formik';
import { useState } from 'react';
import api from '../../services/brasilapi';
import { useEffect } from 'react';
import { useParams } from 'react-router';

const BrasilApi = () => {
    
  const { cepUrl } = useParams();
  const [resultado, setResultado] = useState({});

  useEffect(() => {
    async function loadCep() {
      try {
        const response = await api.get(`/api/cep/v1/${cepUrl}`);
        setResultado(response.data);
      } catch (error) {
        console.log("deu ruim");
      }
    }
    loadCep();
  }, [cepUrl]);


/*   
  const [resultado, setResultado] = useState({});
  const handleSubmit = async ({ cep }) => {
    if (cep) {
      const { data } = await api.get(`/api/cep/v1/${cep}`);
      setResultado(data);
    }
  } */
    return(
        <Formik initialValues={{ cep: '' }} /* onSubmit={handleSubmit} */>
            <Form>
                <Field placeholder="Insira o CEP" required type="text" name="cep" id="cep" className="form-control" />
                <Field placeholder="state" required type="text" value={resultado.state} name="state" id="state" className="form-control" disabled/>
                <Field placeholder="city" required type="text" value={resultado.city} name="city" id="city" className="form-control" disabled/>
                <Field placeholder="neighborhood" required type="text" value={resultado.neighborhood} name="neighborhood" id="neighborhood" className="form-control" disabled/>
                <Field placeholder="street" required type="text" value={resultado.street} name="street" id="street" className="form-control" disabled/>
                <button className="btn btn-primary my-4" type="submit">Pesquisar</button>
            </Form>
        </Formik>
    );
}

export default BrasilApi;