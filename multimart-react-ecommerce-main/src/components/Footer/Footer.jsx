import React from "react"
import "./style.css"
import { Col, Container, Row } from "react-bootstrap"

const Footer = () => {
  return (
    <footer>
        <Container>
          <Row className="footer-row">
            <Col md={3} sm={5} className='box'>
              <div className="logo">
                  <ion-icon name="bag"></ion-icon>
                  <h1>WiproTechWear</h1>
              </div>
              <p>Wiprotechwear blends fashion with the latest in wearable technology, offering products that enhance your daily life. Discover wearable tech that empowers you, only at Wiprotechwear</p>
            </Col>
            <Col md={3} sm={5} className='box'>
              <h2>About Us</h2>
              <ul>
                <li>Terms & Conditions</li>
                <li>Privacy Policy</li>
              </ul>
            </Col>
            <Col md={3} sm={5} className='box'>
              <h2>Customer Care</h2>
              <ul>
                <li>Help Center </li>
                <li>How to Buy </li>
                <li>Track Your Order </li>
              </ul>
            </Col>
            <Col md={3} sm={5} className='box'>
              <h2>Contact Us</h2>
              <ul>
                <li>Wipro office, Wipro SEZ Rd, Madhava Reddy Colony, Gachibowli, Hyderabad, Telangana 500032 </li>
                <li>Email: uilib.help@gmail.com</li>
                <li>Phone: +91 8761221777</li>
              </ul>
            </Col>
          </Row>
        </Container>
    </footer>
  )
}

export default Footer
