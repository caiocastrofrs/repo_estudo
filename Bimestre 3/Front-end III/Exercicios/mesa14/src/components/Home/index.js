import {Formik, Form, Field} from 'formik';

const Home = () => {

    return (
        <>
            <h1>PÁGINA HOME</h1>
            <Formik initialValues={{ cep: '' }} >
            <Form>
              <Field placeholder="Insira o CEP" required type="text" name="cep" id="cep" className="form-control my-3" />
              <button type="submit" className="btn btn-primary">Pesquisar</button>
            </Form>
          </Formik>
        </>
    );
}
export default Home;