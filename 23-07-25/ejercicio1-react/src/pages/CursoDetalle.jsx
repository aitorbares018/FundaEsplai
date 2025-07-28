import { useParams, useNavigate } from 'react-router-dom';
import cursosData from '../data/cursosData';
import { FaClock, FaLayerGroup, FaUser, FaFileDownload, FaArrowLeft } from 'react-icons/fa';

const instructorFotos = {
  'Laura Méndez': '/instructores/laura.jpg',
  'Carlos López': '/instructores/carlos.jpg',
  'Ana Ruiz': '/instructores/ana.jpg',
  'Javier Soto': '/instructores/javier.jpg',
  'Elena García': '/instructores/elena.jpg',
  'Luis Pérez': '/instructores/luis.jpg',
  'Aitana Mendoza': '/instructores/aitana.jpg',
  'Marc Perez': '/instructores/marc.jpg',
  'Sara Jiménez': '/instructores/sara.jpg',
};

export default function CursoDetalle() {
  const { id } = useParams();
  const navigate = useNavigate();
  const curso = cursosData.find((c) => c.id === id);

  if (!curso) {
    return (
      <div style={{ textAlign: 'center', padding: '3rem' }}>
        <h2>❌ Curso no encontrado</h2>
        <button onClick={() => navigate('/cursos')} className="btn-volver" style={{ marginTop: '1rem' }}>
          <FaArrowLeft /> Volver a cursos
        </button>
      </div>
    );
  }

  const descargarTemario = () => {
    alert('Simulación: descarga del temario en PDF iniciada 📄');
  };

  return (
    <article className="detalle-curso">
      <h2>{curso.nombre}</h2>
      <p className="descripcion">{curso.descripcion} Aquí te damos una descripción extendida del curso para que entiendas todo lo que vas a aprender y cómo te beneficiará.</p>

      <div className="detalle-tags">
        <span className="tag"><FaLayerGroup /> {curso.categoria}</span>
        <span className="tag">{curso.nivel}</span>
        <span className="tag"><FaClock /> {curso.duracion}</span>
      </div>

      <div className="instructor-info">
        <img
          src={instructorFotos[curso.instructor] || '/instructores/default.jpg'}
          alt={`Foto de ${curso.instructor}`}
        />
        <div className="instructor-bio">
          <h4><FaUser /> {curso.instructor}</h4>
          <p>Experto/a en {curso.categoria} con años de experiencia impartiendo cursos y ayudando a estudiantes a crecer profesionalmente.</p>
        </div>
      </div>

      <div className="btn-actions">
        <button onClick={() => navigate('/cursos')} className="btn-volver">
          <FaArrowLeft /> Volver a cursos
        </button>
        <button onClick={descargarTemario}>
          <FaFileDownload /> Descargar temario (PDF)
        </button>
      </div>
    </article>
  );
}
