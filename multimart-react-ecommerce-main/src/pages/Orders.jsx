import React, { useEffect, useState } from 'react';

function Orders(){
const [loading, setLoading] = useState(true);
const [error, setError] = useState(null);
const[orders,setOrders]=useState;
useEffect(() => {
    fetch('http://localhost:8086/order')
      .then(response => {
        if (!response.ok) {
          throw new Error('Network response was not ok');
        }
        return response.json();
      })
      .then(data => {
        setOrders(data); 
        setLoading(false);
      })
      .catch(error => {
        console.error("Error fetching products:", error);
        setError("Failed to fetch products.");
        setLoading(false);
      });
  }, []);
  if (loading) return <p>Loading products...</p>;
  if (error) return <p>{error}</p>;

  return (
    <div>
      <div>
      <ul>
        {orders.map(order => (
          <li key={order.id}>
          </li>
        ))}
      </ul>
    </div>
    </div>
  );
}

export default Orders;