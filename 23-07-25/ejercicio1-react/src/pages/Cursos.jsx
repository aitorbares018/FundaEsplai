import { Link, useSearchParams } from 'react-router-dom';
import { FaClock, FaLayerGroup, FaUser } from 'react-icons/fa';
import cursosData from '../data/cursosData';

export default function Cursos() {
  const [searchParams, setSearchParams] = useSearchParams();
  const categoria = searchParams.get('categoria') || '';
  const nivel = searchParams.get('nivel') || '';

  const cambiarFiltro = (cat, niv) => {
    const params = {};
    if (cat) params.categoria = cat;
    if (niv) params.nivel = niv;
    setSearchParams(params);
  };

  const cursosFiltrados = cursosData.filter((curso) => {
    return (
      (!categoria || curso.categoria === categoria) &&
      (!nivel || curso.nivel.toLowerCase() === nivel.toLowerCase())
    );
  });

  return (
    <div>
      <h2 style={{ color: '#0d47a1', textAlign: 'center', marginBottom: '1rem' }}>
        Cursos disponibles
      </h2>

      <div className="filtros-select">
        <div className="filtro-item">
          <label htmlFor="categoria">Categoría:</label>
          <select
            id="categoria"
            value={categoria}
            onChange={(e) => cambiarFiltro(e.target.value, nivel)}
          >
            <option value="">Todas</option>
            <option value="frontend">Frontend</option>
            <option value="backend">Backend</option>
            <option value="bd">Base de Datos</option>
          </select>
        </div>

        <div className="filtro-item">
          <label htmlFor="nivel">Nivel:</label>
          <select
            id="nivel"
            value={nivel}
            onChange={(e) => cambiarFiltro(categoria, e.target.value)}
          >
            <option value="">Todos</option>
            <option value="básico">Básico</option>
            <option value="intermedio">Intermedio</option>
            <option value="avanzado">Avanzado</option>
          </select>
        </div>
      </div>

      <ul className="cursos-lista">
        {cursosFiltrados.map((curso) => (
          <li key={curso.id} className="curso-card">
            <h3 className="curso-titulo">{curso.nombre}</h3>
            <p className="curso-descripcion">
              {curso.descripcion.length > 100
                ? curso.descripcion.substring(0, 100) + '...'
                : curso.descripcion}
            </p>
            <div className="info-tags">
              <span className="tag">
                <FaLayerGroup /> {curso.categoria}
              </span>
              <span className="tag">{curso.nivel}</span>
              <span className="tag">
                <FaClock /> {curso.duracion}
              </span>
              <span className="tag">
                <FaUser /> {curso.instructor}
              </span>
            </div>
            <Link to={`/cursos/${curso.id}`}>
              <button className="ver-mas">Ver más detalles</button>
            </Link>
          </li>
        ))}
      </ul>
    </div>
  );
}
