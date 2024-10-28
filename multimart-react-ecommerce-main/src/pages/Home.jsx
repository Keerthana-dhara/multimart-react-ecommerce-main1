import { Fragment } from "react";
import Wrapper from "../components/wrapper/Wrapper";
import Section from "../components/Section";
import SliderHome from "../components/Slider";
import useWindowScrollToTop from "../hooks/useWindowScrollToTop";

const Home = () => {
  useWindowScrollToTop();
  return (
    <Fragment>
      <SliderHome />
      <Wrapper />
    </Fragment>
  );
};

export default Home;
