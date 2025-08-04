import React, { useState } from 'react';

function LoginButton(props) {
  return (
    <button onClick={props.onClick}>
      Login
    </button>
  );
}

function LogoutButton(props) {
  return (
    <button onClick={props.onClick}>
      Logout
    </button>
  );
}

function GuestGreeting() {
  return (
    <div>
      <h1>Please sign up.</h1>
    </div>
  );
}


function UserGreeting() {
  const flights = [
    { id: 1, from: "Mumbai", to: "Delhi", price: 3500 },
    { id: 2, from: "Bangalore", to: "Chennai", price: 2500 },
    { id: 3, from: "Hyderabad", to: "Pune", price: 3000 },
  ];

  const handleBook = (flight) => {
    alert(`Booking confirmed!\nFlight: ${flight.from} ➝ ${flight.to}\nPrice: ₹${flight.price}`);
  };

  return (
    <div>
      <h1><strong>Welcome back</strong></h1>
      <p>✅ You can now book tickets from the available flights.</p>

      <h3>Available Flights:</h3>
      <ul style={{ listStyle: "none", paddingLeft: 0 }}>
        {flights.map((flight) => (
          <li key={flight.id} style={{ marginBottom: '10px' }}>
            ✈️ {flight.from} ➝ {flight.to} - ₹{flight.price} &nbsp;
            <button onClick={() => handleBook(flight)}>Book Ticket</button>
          </li>
        ))}
      </ul>
    </div>
  );
}

function Greeting(props) {
  const isLoggedIn = props.isLoggedIn;
  if (isLoggedIn) {
    return <UserGreeting />;
  }
  return <GuestGreeting />;
}
function App() {
  const [isLoggedIn, setIsLoggedIn] = useState(false);

  const handleLoginClick = () => setIsLoggedIn(true);
  const handleLogoutClick = () => setIsLoggedIn(false);

  let button;
  if (isLoggedIn) {
    button = <LogoutButton onClick={handleLogoutClick} />;
  } else {
    button = <LoginButton onClick={handleLoginClick} />;
  }

  return (
    <div style={{ textAlign: "center", marginTop: "50px" }}>
      <Greeting isLoggedIn={isLoggedIn} />
      <div style={{ marginTop: "20px" }}>{button}</div>
    </div>
  );
}

export default App;