import { Routes, Route } from 'react-router-dom';
import MainLayout from './layouts/MainLayout';
import Home from './pages/Home';
import Cursos from './pages/Cursos';
import CursoDetalle from './pages/CursoDetalle';
import Login from './pages/Login';
import Admin from './pages/Admin';
import NotFound from './pages/NotFound';
import './App.css';
<link href="https://fonts.googleapis.com/css2?family=Roboto&display=swap" rel="stylesheet" />



export default function App() {
  return (
    
    <Routes>
      <Route path="/" element={<MainLayout />}>
        <Route index element={<Home />} />
        <Route path="cursos" element={<Cursos />} />
        <Route path="cursos/:id" element={<CursoDetalle />} />
        <Route path="login" element={<Login />} />
        <Route path="admin" element={<Admin />} />
        <Route path="*" element={<NotFound />} />
      </Route>
    </Routes>
  );
}
