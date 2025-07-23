import { Link, useSearchParams } from 'react-router-dom';
import cursosData from '../data/cursosData';

export default function Cursos() {
  const [searchParams, setSearchParams] = useSearchParams();
  const categoria = searchParams.get('categoria');

  const cursosFiltrados = categoria
    ? cursosData.filter((curso) => curso.categoria === categoria)
    : cursosData;

  const cambiarFiltro = (cat) => {
    setSearchParams(cat ? { categoria: cat } : {});
  };

  return (
    <div className="cursos">
      <h1>📚 Cursos disponibles</h1>

      <div className="filtros">
        <button onClick={() => cambiarFiltro('frontend')}>Frontend</button>
        <button onClick={() => cambiarFiltro('backend')}>Backend</button>
        <button onClick={() => cambiarFiltro('bd')}>Base de Datos</button>
        <button onClick={() => cambiarFiltro(null)}>Todos</button>
      </div>

      <ul>
        {cursosFiltrados.map((curso) => (
          <li key={curso.id}>
            <h3>{curso.nombre}</h3>
            <p>{curso.descripcion}</p>
            <p><strong>Duración:</strong> {curso.duracion}</p>
            <p><strong>Nivel:</strong> {curso.nivel}</p>
            <p><strong>Instructor:</strong> {curso.instructor}</p>
            <Link to={`/cursos/${curso.id}`}>
              <button>Más información</button>
            </Link>
          </li>
        ))}
      </ul>
    </div>
  );
}
