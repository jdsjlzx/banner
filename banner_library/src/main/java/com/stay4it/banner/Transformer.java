package com.stay4it.banner;

import android.support.v4.view.ViewPager.PageTransformer;

import com.stay4it.banner.transformer.AccordionTransformer;
import com.stay4it.banner.transformer.BackgroundToForegroundTransformer;
import com.stay4it.banner.transformer.CubeInTransformer;
import com.stay4it.banner.transformer.CubeOutTransformer;
import com.stay4it.banner.transformer.DefaultTransformer;
import com.stay4it.banner.transformer.DepthPageTransformer;
import com.stay4it.banner.transformer.FlipHorizontalTransformer;
import com.stay4it.banner.transformer.FlipVerticalTransformer;
import com.stay4it.banner.transformer.ForegroundToBackgroundTransformer;
import com.stay4it.banner.transformer.RotateDownTransformer;
import com.stay4it.banner.transformer.RotateUpTransformer;
import com.stay4it.banner.transformer.ScaleInOutTransformer;
import com.stay4it.banner.transformer.StackTransformer;
import com.stay4it.banner.transformer.TabletTransformer;
import com.stay4it.banner.transformer.ZoomInTransformer;
import com.stay4it.banner.transformer.ZoomOutSlideTransformer;
import com.stay4it.banner.transformer.ZoomOutTranformer;

public class Transformer {
    public static Class<? extends PageTransformer> Default = DefaultTransformer.class;
    public static Class<? extends PageTransformer> Accordion = AccordionTransformer.class;
    public static Class<? extends PageTransformer> BackgroundToForeground = BackgroundToForegroundTransformer.class;
    public static Class<? extends PageTransformer> ForegroundToBackground = ForegroundToBackgroundTransformer.class;
    public static Class<? extends PageTransformer> CubeIn = CubeInTransformer.class;
    public static Class<? extends PageTransformer> CubeOut = CubeOutTransformer.class;
    public static Class<? extends PageTransformer> DepthPage = DepthPageTransformer.class;
    public static Class<? extends PageTransformer> FlipHorizontal = FlipHorizontalTransformer.class;
    public static Class<? extends PageTransformer> FlipVertical = FlipVerticalTransformer.class;
    public static Class<? extends PageTransformer> RotateDown = RotateDownTransformer.class;
    public static Class<? extends PageTransformer> RotateUp = RotateUpTransformer.class;
    public static Class<? extends PageTransformer> ScaleInOut = ScaleInOutTransformer.class;
    public static Class<? extends PageTransformer> Stack = StackTransformer.class;
    public static Class<? extends PageTransformer> Tablet = TabletTransformer.class;
    public static Class<? extends PageTransformer> ZoomIn = ZoomInTransformer.class;
    public static Class<? extends PageTransformer> ZoomOut = ZoomOutTranformer.class;
    public static Class<? extends PageTransformer> ZoomOutSlide = ZoomOutSlideTransformer.class;
}
