<template>
  <div class="onboard">
    <HeaderNav />
    <section class="banner">
      <img class="banner-img" src="@/assets/banner-illust.png" />
      <div class="banner-info">
        <h1 class="banner-title" data-aos="fade-up" data-aos-duration="1000">
          방과후에는<br /><span class="underline"> 방과워</span>와 함께+
        </h1>
        <p
          class="banner-desc"
          data-aos="fade-up"
          data-aos-duration="1000"
          data-aos-delay="100"
        >
          방과워 서비스는<br />
          봉사자에게는 재능 나눔의 기회를 제공하고,<br />
          내 자녀에게는 방과후 활동을 제공합니다.
        </p>
      </div>
    </section>
    <section class="info-part">
      <h2 class="banner-desc" data-aos="fade-up" data-aos-duration="1000">
        <span class="underline">속마음</span> 털어놓을<br />곳이 없을 때는
        여기로~
      </h2>
      <div
        class="part-desc"
        data-aos="fade-up"
        data-aos-duration="1000"
        data-aos-delay="150"
      >
        아무도 모르는 나만의 비밀친구!
      </div>
      <div class="part-content">
        <div
          class="info-box"
          data-aos="fade-up"
          data-aos-duration="1000"
          data-aos-delay="200"
        >
          <div class="info-card">
            <img src="@/assets/consult-1.png" />
          </div>
          <div class="info-desc">학업</div>
        </div>
        <div class="info-box" data-aos="fade-up" data-aos-duration="1000">
          <div class="info-card">
            <img src="@/assets/consult-2.png" />
          </div>
          <div class="info-desc">친구</div>
        </div>

        <div
          class="info-box"
          data-aos="fade-up"
          data-aos-duration="1000"
          data-aos-delay="400"
        >
          <div class="info-card">
            <img src="@/assets/consult-3.png" />
          </div>
          <div class="info-desc">진로</div>
        </div>

        <div
          class="info-box"
          data-aos="fade-up"
          data-aos-duration="1000"
          data-aos-delay="500"
        >
          <div class="info-card">
            <img src="@/assets/consult-4.png" />
          </div>
          <div class="info-desc">연애</div>
        </div>
        <img class="info-img" src="@/assets/consult-main.png" />
      </div>
    </section>

    <section class="info-part">
      <h2 class="lecture-title" data-aos="fade-up" data-aos-duration="1000">
        화면 속에서 만나는<br />
        나만의 <span class="underline">봉사자 선생님</span>
      </h2>
      <div
        class="part-desc"
        data-aos="fade-up"
        data-aos-duration="1000"
        data-aos-delay="150"
      >
        비대면으로 만나는 방과 후 선생님!
      </div>
      <div class="part-content">
        <div class="container">
          <div class="content-left">
            <div class="short-desc">이런 기능을 제공합니다!</div>
            <div
              class="lecture-card"
              data-aos="fade-right"
              data-aos-duration="1000"
            >
              <div class="lecture-icon">
                <img src="@/assets/lecture-icon1.png" />
              </div>
              <div class="icon-desc">
                <span>내가 선택해서 듣는 온라인 방과후 수업</span>
              </div>
            </div>
            <div
              class="lecture-card"
              data-aos="fade-right"
              data-aos-duration="1000"
              data-aos-delay="100"
            >
              <div class="lecture-icon">
                <img src="@/assets/lecture-icon2.png" />
              </div>
              <div class="icon-desc">
                <span>수업에 대한 자녀 피드백 열람</span>
              </div>
            </div>
            <div
              class="lecture-card"
              data-aos="fade-right"
              data-aos-duration="1000"
              data-aos-delay="200"
            >
              <div class="lecture-icon">
                <img src="@/assets/lecture-icon3.png" />
              </div>
              <div class="icon-desc">
                <span>OX 퀴즈를 통한 참여 유도</span>
              </div>
            </div>
          </div>
          <div class="content-right">
            <img src="@/assets/lecture-img.png" />
          </div>
        </div>
      </div>
    </section>
    <section class="info-part">
      <h2 class="lecture-title" data-aos="fade-up" data-aos-duration="1000">
        내가 듣고싶은 수업이 없다면<br />
        <span class="underline">수업을 요청</span>해보세요!
      </h2>
      <div
        class="part-desc"
        data-aos="fade-up"
        data-aos-duration="1000"
        data-aos-delay="150"
      >
        봉사자들이 여러분들의 요청을 기다리고 있어요
      </div>
      <div class="part-content">
        <div class="request-img"><img src="@/assets/request-img.png" /></div>
      </div>
    </section>
    <button class="fixed-btn" @click="clickStart">지금 시작하기</button>
  </div>
</template>

<script>
import { useRouter } from "vue-router";
import HeaderNav from "@/components/HeaderNav.vue";
export default {
  name: "HomeView",
  setup() {
    const router = useRouter();
    const clickStart = () => {
      const userInfo = JSON.parse(localStorage.getItem("user"));
      if (userInfo) router.push("/class/list");
      else router.push("/user/login");
    };

    return {
      clickStart,
    };
  },
  components: {
    HeaderNav,
  },
};
</script>

<style scoped src="@/css/home.scss" lang="scss"></style>
