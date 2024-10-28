
import mouse from '../Images/mouse.png';
import laptop from '../Images/laptop.jpg'
import phone08 from "../Images/phone-08.png";
import phone from "../Images/phone.jpg";
import wireless from '../Images/wireless.png';
import watch from '../Images/watch.png';
import wireless01 from "../Images/wireless-01.png";
import watchSlide from "../Images/watch-07.png";

export const SliderData = [
  {
      id: 2,
      title: "50% Off For Your First Shopping",
      desc: "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Quis lobortis consequat eu, quam etiam at quis ut convallis.",
      cover: phone08,
  },
  {
      id: 3,
      title: "50% Off For Your First Shopping",
      desc: "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Quis lobortis consequat eu, quam etiam at quis ut convallis.",
      cover: wireless01,
  },
  {
      id: 4,
      title: "50% Off For Your First Shopping",
      desc: "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Quis lobortis consequat eu, quam etiam at quis ut convallis.",
      cover: watchSlide,
  },
];


export const serviceData = [
  {
    icon: <ion-icon name="car"></ion-icon>,
    title: "Free Shipping",
    subtitle: "Lorem ipsum dolor sit amet.",
    bg: "#fdefe6",
  },
  {
    icon: <ion-icon name="card"></ion-icon>,
    title: "Safe Payment",
    subtitle: "Lorem ipsum dolor sit amet.",
    bg: "#ceebe9",
  },
  {
    icon: <ion-icon name="shield-half-outline"></ion-icon>,
    title: "Secure Payment",
    subtitle: "Lorem ipsum dolor sit amet.",
    bg: "#e2f2b2",
  },
  {
    icon: <ion-icon name="headset"></ion-icon>,
    title: " Back Guarantee",
    subtitle: "Lorem ipsum dolor sit amet.",
    bg: "#d6e5fb",
  },
];


export const images = [
   {url: watch, category:"watch"} ,
   {url:phone, category:"phone"},
   {url:wireless, category:"wireless"},
   {url:mouse,category:"mouse"},
   {url:laptop,category:"laptop"}
  ];

  export let products = [];

  export const setProductsData = (data) => {
    products = data;
  };
  export const getProductsData = () => products;
  

