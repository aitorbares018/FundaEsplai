import { useState } from 'react';

export function Fotos() {
  const [vehiculo, setVehiculo] = useState('bici');

  const imagenes = {
    coche: 'https://tse4.mm.bing.net/th/id/OIP.doj7AEdfffeesGJ0ygnaxwHaEK?r=0&rs=1&pid=ImgDetMain&o=7&rm=3',
    moto: 'https://i.pinimg.com/originals/b5/a8/bd/b5a8bdb5d742a71925d00d85e20ac61c.jpg',
    bici: 'https://tse2.mm.bing.net/th/id/OIP.SEFbLrKFny0S8RQUUl1h0QHaEc?r=0&rs=1&pid=ImgDetMain&o=7&rm=3',
    bus: 'https://th.bing.com/th/id/R.5fb3fa2bf1fbe0951f8c978d18d62c4b?rik=Ogt%2bw4%2b6pinm1w&riu=http%3a%2f%2fwww.nedicorsa.com%2fwp-content%2fuploads%2f2020%2f03%2fBus-amarillo-G4.png&ehk=d6HaZqJN5Tu1alVD6ROoClUoQKYYuGKHBtZDTkMq6S0%3d&risl=&pid=ImgRaw&r=0',
  };
 return (
    <div style={{ textAlign: 'center' }}>
      <select
        value={vehiculo}
        onChange={(e) => setVehiculo(e.target.value)}
        style={{
          padding: '8px 12px',
          fontSize: '16px',
          borderRadius: '5px',
          border: '1px solid #ccc',
        }}
      >
        <option value="coche">Coche</option>
        <option value="moto">Moto</option>
        <option value="bici">Bici</option>
        <option value="bus">Bus</option>
      </select>

      <div style={{ marginTop: '20px' }}>
        <img
          src={imagenes[vehiculo]}
          alt={vehiculo}
          style={{
            width: '150px',
            height: '150px',
            objectFit: 'contain',
            borderRadius: '10px',
            boxShadow: '0 4px 8px rgba(0,0,0,0.2)',
            transition: '0.3s',
          }}
        />
      </div>
    </div>
  );
}