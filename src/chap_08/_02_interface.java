package chap_08;

import chap_08.reporter.NormalReporter;
import chap_08.reporter.VideoReporter;

public class _02_interface {
    public static void main(String[] args) {
        // 인터페이스
        NormalReporter normalReporter = new NormalReporter();
        normalReporter.report();

        VideoReporter videoReporter = new VideoReporter();
        videoReporter.report();

    }
}
