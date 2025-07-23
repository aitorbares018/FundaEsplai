import './CursoDetalle.css';
import { useParams, Link } from 'react-router-dom';
import cursosData from '../data/cursosData';

export default function CursoDetalle() {
  const { id } = useParams();
  const curso = cursosData.find(c => c.id === id);

  if (!curso) {
    return <p>Curso no encontrado.</p>;
  }

  return (
    <div className="curso-detalle">
      <h1>{curso.nombre}</h1>
      <p><strong>Categoría:</strong> {curso.categoria}</p>
      <p><strong>Descripción:</strong> {curso.descripcion}</p>
      <p><strong>Duración:</strong> {curso.duracion}</p>
      <p><strong>Nivel:</strong> {curso.nivel}</p>
      <p><strong>Instructor:</strong> {curso.instructor}</p>

      <Link to="/cursos" className="volver">← Volver a cursos</Link>
    </div>
  );
}
