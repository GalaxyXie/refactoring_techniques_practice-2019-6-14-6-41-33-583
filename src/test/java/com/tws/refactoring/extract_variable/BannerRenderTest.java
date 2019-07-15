package com.tws.refactoring.extract_variable;

import org.junit.Test;

import static org.junit.Assert.*;

public class BannerRenderTest {
    @Test
    public void should_return_IE_on_Mac_when_platform_is_IE_ON_MAC(){
        //given
        BannerRender bannerRender=new BannerRender();
        //when
        String banner=bannerRender.renderBanner("MAC","IE");
        //then
        assertSame("IE on Mac?",banner);

    }
    @Test
    public void should_return_banner_when_platform_is_IE_ON_Windows(){
        //given
        BannerRender bannerRender=new BannerRender();
        //when
        String banner=bannerRender.renderBanner("WINDOWS","IE");
        //then
        assertSame("banner",banner);

    }
    @Test
    public void should_return_banner_when_platform_is_Chrome_ON_MAC(){
        //given
        BannerRender bannerRender=new BannerRender();
        //when
        String banner=bannerRender.renderBanner("Chrome","MAC");
        //then
        assertSame("banner",banner);

    }

}