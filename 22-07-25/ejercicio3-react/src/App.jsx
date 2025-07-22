import { useEffect, useState } from 'react';

function App() {
  const [ciudades, setCiudades] = useState([]);
  const [provinciaFiltro, setProvinciaFiltro] = useState('');
  const [poblacionMinima, setPoblacionMinima] = useState(20000);

  useEffect(() => {
    fetch('/ciudades.json')
      .then((res) => res.json())
      .then((data) => setCiudades(data))
      .catch((err) => console.error('Error al cargar ciudades:', err));
  }, []);

  const ciudadesFiltradas = ciudades.filter((ciudad) => {
    const coincideProvincia = provinciaFiltro ? ciudad.provincia === provinciaFiltro : true;
    const superaPoblacion = ciudad['población'] >= poblacionMinima;
    return coincideProvincia && superaPoblacion;
  });

  return (
    <div style={{ padding: '40px', fontFamily: 'sans-serif' }}>
      <h1 style={{ textAlign: 'center' }}>Ciudades de Cataluña</h1>

      <div style={{ display: 'flex', flexDirection: 'column', alignItems: 'center', gap: '20px', marginBottom: '30px' }}>
        <div style={{ display: 'flex', gap: '10px', flexWrap: 'wrap' }}>
          {['Barcelona', 'Tarragona', 'Lérida', 'Gerona'].map((prov) => (
            <button
              key={prov}
              onClick={() => setProvinciaFiltro(provinciaFiltro === prov ? '' : prov)}
              style={{
                padding: '8px 16px',
                backgroundColor: provinciaFiltro === prov ? '#4caf50' : '#eee',
                color: provinciaFiltro === prov ? '#fff' : '#000',
                border: '1px solid #ccc',
                borderRadius: '5px',
                cursor: 'pointer',
              }}
            >
              {prov}
            </button>
          ))}
        </div>

        <div style={{ width: '300px', textAlign: 'center' }}>
          <label>
            Población mínima: {poblacionMinima.toLocaleString()}
          </label>
          <input
            type="range"
            min={20000}
            max={150000}
            step={10000}
            value={poblacionMinima}
            onChange={(e) => setPoblacionMinima(Number(e.target.value))}
            style={{ width: '100%' }}
          />
        </div>
      </div>

      <div style={{ display: 'flex', justifyContent: 'center' }}>
        <table style={{ borderCollapse: 'collapse', width: '80%', backgroundColor: '#fff', boxShadow: '0 2px 8px rgba(0,0,0,0.1)' }}>
          <thead>
            <tr style={{ backgroundColor: '#4caf50', color: '#fff' }}>
              <th style={{ padding: '10px', border: '1px solid #ddd' }}>Municipio</th>
              <th style={{ padding: '10px', border: '1px solid #ddd' }}>Provincia</th>
              <th style={{ padding: '10px', border: '1px solid #ddd' }}>Población</th>
            </tr>
          </thead>
          <tbody>
            {ciudadesFiltradas.map((ciudad, index) => (
              <tr key={index}>
                <td style={{ padding: '10px', border: '1px solid #ddd' }}>{ciudad.municipio}</td>
                <td style={{ padding: '10px', border: '1px solid #ddd' }}>{ciudad.provincia}</td>
                <td style={{ padding: '10px', border: '1px solid #ddd' }}>{ciudad['población'].toLocaleString()}</td>
              </tr>
            ))}
            {ciudadesFiltradas.length === 0 && (
              <tr>
                <td colSpan="3" style={{ padding: '10px', textAlign: 'center' }}>No hay ciudades que coincidan.</td>
              </tr>
            )}
          </tbody>
        </table>
      </div>
    </div>
  );
}

export default App;
