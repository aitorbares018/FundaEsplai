import { Routes, Route, Navigate } from 'react-router-dom';
import MainLayout from './layouts/MainLayout';
import Home from './pages/Home';
import Cursos from './pages/Cursos';
import CursoDetalle from './pages/CursoDetalle';
import Contacto from './pages/Contacto';
import Perfil from './pages/Perfil';
import Login from './pages/Login';
import './App.css';

// Simulación de autenticación
const estaAutenticado = false;

function App() {
  return (
    <Routes>
      <Route path="/" element={<MainLayout />}>
        <Route index element={<Home />} />
        <Route path="cursos" element={<Cursos />} />
        <Route path="cursos/:id" element={<CursoDetalle />} />
        <Route path="contacto" element={<Contacto />} />
        <Route
          path="perfil"
          element={estaAutenticado ? <Perfil /> : <Navigate to="/login" />}
        />
        <Route path="login" element={<Login />} />
        <Route path="*" element={<h2>404 - Página no encontrada</h2>} />
      </Route>
    </Routes>
  );
}

export default App;
