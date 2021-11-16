import { Component } from "react";
import { Formik, Form, Field } from 'formik';
import Swal from 'sweetalert2';
import './style.scss';
export default class Formulario extends Component {
  handleSubmit = ({ nome, telefone, email}) => {
    if (nome === '') {
      Swal.fire({
        title: 'Aconteceu um erro',
        icon: 'error',
        text: 'Ih rapaz'
      });
    }
    else {
      Swal.fire({
        title: 'Valores enviados',
        icon: 'success',
        text: `Nome: ${nome}` + `\nTelefone: ${telefone}` + `\nEmail: ${email}`
      })
    }
    
  }

  render() {
    return (
      <>
        <Formik initialValues={{ nome: '', number: 0 }} onSubmit={this.handleSubmit}>
          <Form id="formulario">
            <Field placeholder="Insira seu nome" type="text" name="nome" id="nome" className="form-control" />
            <Field placeholder="Insira seu telefone" type="number" name="telefone" id="telefone" className="form-control" />
            <Field placeholder="Insira seu email" type="email" name="email" id="email" className="form-control" />
            <button className="btn btn-primary" type="submit">Enviar</button>
          </Form>
        </Formik>
      </>
    )
  }
}