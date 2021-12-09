import { BrowserRouter, Routes, Route } from 'react-router-dom';
import ApiCEP from '../components/ApiCEP';
import BrasilApi from '../components/BrasilApi';
import NotFound from '../components/NotFound';
import Home from '../components/Home';

const RouteList = () => (
  <BrowserRouter>
    <Routes>
      <Route path="/" element={<Home />} />
      <Route path="/apicep" element={<ApiCEP />} />
      <Route path="/apicep/:cepUrl" element={<ApiCEP />} />
      <Route path="/brasilapi" element={<BrasilApi />} />
      <Route path="/brasilapi/:cepUrl" element={<BrasilApi />} />
      <Route path="*" element={<NotFound />} />
    </Routes>
  </BrowserRouter>
);

export default RouteList;