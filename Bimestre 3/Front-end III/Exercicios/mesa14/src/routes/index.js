import { BrowserRouter, Routes, Route } from 'react-router-dom';
import ApiCEP from '../components/ApiCEP';
import BrasilApi from '../components/BrasilApi';

const RouteList = () => (
  <BrowserRouter>
    <Routes>
      <Route path="/apicep" element={<ApiCEP />} />
      <Route path="/brasilapi" element={<BrasilApi />} />
    </Routes>
  </BrowserRouter>
);

export default RouteList;