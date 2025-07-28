import { Link } from 'react-router-dom';
import { FaChalkboardTeacher, FaLaptopCode, FaUsers, FaCheckCircle } from 'react-icons/fa';

export default function Home() {
  return (
    <main style={{ maxWidth: 900, margin: '2rem auto', padding: '0 1rem' }}>
      <section style={{ textAlign: 'center', paddingBottom: '3rem' }}>
        <h1 style={{ fontSize: '3rem', color: '#0d47a1', marginBottom: '0.5rem' }}>
          Bienvenido a EducaPro
        </h1>
        <p style={{ fontSize: '1.25rem', color: '#555', maxWidth: 600, margin: '0 auto' }}>
          La plataforma líder para tu crecimiento profesional. Aprende desde cero o mejora tus habilidades con cursos online diseñados por expertos.
        </p>
        <Link 
          to="/cursos" 
          style={{
            display: 'inline-block',
            marginTop: '2rem',
            backgroundColor: '#1976d2',
            color: 'white',
            padding: '1rem 3rem',
            borderRadius: '30px',
            fontWeight: '700',
            fontSize: '1.1rem',
            textDecoration: 'none',
            boxShadow: '0 4px 10px rgba(25, 118, 210, 0.4)',
            transition: 'background-color 0.3s ease',
          }}
          onMouseOver={e => e.currentTarget.style.backgroundColor = '#1565c0'}
          onMouseOut={e => e.currentTarget.style.backgroundColor = '#1976d2'}
        >
          Explora los Cursos
        </Link>
      </section>

      <section style={{ display: 'flex', justifyContent: 'space-around', flexWrap: 'wrap', gap: '2rem', marginBottom: '4rem' }}>
        <div style={{ flex: '1 1 250px', backgroundColor: '#f5f9ff', padding: '2rem', borderRadius: '15px', boxShadow: '0 4px 12px rgba(0,0,0,0.05)' }}>
          <FaChalkboardTeacher size={50} color="#1976d2" style={{ marginBottom: '1rem' }} />
          <h3 style={{ color: '#0d47a1' }}>Profesores Expertos</h3>
          <p style={{ color: '#555' }}>
            Aprende con instructores certificados con amplia experiencia en la industria.
          </p>
        </div>

        <div style={{ flex: '1 1 250px', backgroundColor: '#f5f9ff', padding: '2rem', borderRadius: '15px', boxShadow: '0 4px 12px rgba(0,0,0,0.05)' }}>
          <FaLaptopCode size={50} color="#1976d2" style={{ marginBottom: '1rem' }} />
          <h3 style={{ color: '#0d47a1' }}>Tecnologías Actualizadas</h3>
          <p style={{ color: '#555' }}>
            Cursos modernos con contenido actualizado para las últimas tendencias tecnológicas.
          </p>
        </div>

        <div style={{ flex: '1 1 250px', backgroundColor: '#f5f9ff', padding: '2rem', borderRadius: '15px', boxShadow: '0 4px 12px rgba(0,0,0,0.05)' }}>
          <FaUsers size={50} color="#1976d2" style={{ marginBottom: '1rem' }} />
          <h3 style={{ color: '#0d47a1' }}>Comunidad Activa</h3>
          <p style={{ color: '#555' }}>
            Participa en foros y grupos para compartir experiencias y crecer junto a otros estudiantes.
          </p>
        </div>

        <div style={{ flex: '1 1 250px', backgroundColor: '#f5f9ff', padding: '2rem', borderRadius: '15px', boxShadow: '0 4px 12px rgba(0,0,0,0.05)' }}>
          <FaCheckCircle size={50} color="#1976d2" style={{ marginBottom: '1rem' }} />
          <h3 style={{ color: '#0d47a1' }}>Certificados Oficiales</h3>
          <p style={{ color: '#555' }}>
            Al completar un curso obtén un certificado que puedes añadir a tu CV o LinkedIn.
          </p>
        </div>
      </section>

      <section style={{ textAlign: 'center', marginBottom: '5rem' }}>
        <h2 style={{ fontSize: '2rem', color: '#0d47a1', marginBottom: '1rem' }}>¿Por qué elegir EducaPro?</h2>
        <ul style={{ listStyle: 'none', maxWidth: 700, margin: '0 auto', textAlign: 'left', color: '#555', fontSize: '1.1rem', lineHeight: '1.6' }}>
          <li>✔️ Contenido actualizado y práctico</li>
          <li>✔️ Plataforma intuitiva y fácil de usar</li>
          <li>✔️ Acceso desde cualquier dispositivo, en cualquier momento</li>
          <li>✔️ Soporte y acompañamiento durante tu aprendizaje</li>
        </ul>
      </section>

      <section style={{ textAlign: 'center', marginBottom: '3rem' }}>
        <h2 style={{ fontSize: '2rem', color: '#0d47a1', marginBottom: '3rem' }}>¿Listo para empezar?</h2>
        <Link 
          to="/cursos" 
          style={{
            backgroundColor: '#0d47a1',
            color: 'white',
            padding: '1rem 3rem',
            borderRadius: '30px',
            fontWeight: '700',
            fontSize: '1.1rem',
            textDecoration: 'none',
            boxShadow: '0 4px 10px rgba(13, 71, 161, 0.6)',
            transition: 'background-color 0.3s ease',
          }}
          onMouseOver={e => e.currentTarget.style.backgroundColor = '#0b3a80'}
          onMouseOut={e => e.currentTarget.style.backgroundColor = '#0d47a1'}
        >


          Explora los Cursos
        </Link>
      </section>
    </main>
  );
}
