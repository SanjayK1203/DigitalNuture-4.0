import React from 'react';
import './App.css';

function App() {
  const officeSpaces = [
    {
      Name: 'DBS',
      Rent: 50000,
      Address: 'Chennai',
      imageUrl: 'https://content.instantoffices.com/sc/Prod/images/centres/1600width/116781/116781-783075.jpg'
    },
  ];

  return (
    <div style={{ textAlign: 'center', padding: '30px' }}>
      <h1><strong>Office Space , at Affordable Range</strong></h1>

      {officeSpaces.map((item, index) => {
        const colorClass = item.Rent <= 60000 ? 'textRed' : 'textGreen';
        return (
          <div key={index} style={{ marginTop: '30px' }}>
            <img src={item.imageUrl} alt={item.Name} style={{ width: '300px', height: '200px' }} />
            <h2>Name: {item.Name}</h2>
            <h3 className={colorClass}>Rent: Rs. {item.Rent}</h3>
            <h3>Address: {item.Address}</h3>
          </div>
        );
      })}
    </div>
  );
}

export default App;